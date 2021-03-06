package us.dot.its.jpo.ode.importer.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

import org.apache.tomcat.util.buf.HexUtils;
import org.junit.Test;

import mockit.Injectable;
import mockit.Tested;
import us.dot.its.jpo.ode.importer.parser.FileParser.FileParserException;
import us.dot.its.jpo.ode.importer.parser.FileParser.ParserStatus;

public class PayloadParserTest {
   
   @Tested
   PayloadParser payloadParser;
   @Injectable long bundleId;

   /**
    * Should extract payloadLength and payload and return ParserStatus.COMPLETE
    */
   @Test
   public void testAll() {

      ParserStatus expectedStatus = ParserStatus.COMPLETE;
      byte[] expectedPayload = new byte[] { (byte)0x03, (byte)0x81, (byte)0x00, (byte)0x40, (byte)0x03, (byte)0x80 };
      int expectedStep = 0;

      BufferedInputStream testInputStream = new BufferedInputStream(
         new ByteArrayInputStream(new byte[] { 
               (byte)0x06, (byte)0x00,                         //0 payloadLength
                                                               //1 payload
               (byte)0x03, (byte)0x81, (byte)0x00, (byte)0x40, (byte)0x03, (byte)0x80 
               }));

      try {
         assertEquals(expectedStatus, payloadParser.parseFile(testInputStream, "testLogFile.bin"));
         assertEquals(6, payloadParser.getPayloadLength());
         assertEquals(HexUtils.toHexString(expectedPayload), HexUtils.toHexString(payloadParser.getPayload()));
         assertEquals(expectedStep, payloadParser.getStep());
      } catch (FileParserException e) {
         fail("Unexpected exception: " + e);
      }
   }

   /**
    * Step 10 test without enough bytes. Should return PARTIAL.
    */
   @Test
   public void testPayloadLengthPartial() {

      ParserStatus expectedStatus = ParserStatus.PARTIAL;
      int expectedStep = 0;

      BufferedInputStream testInputStream = new BufferedInputStream(
         new ByteArrayInputStream(new byte[] { 
               (byte)0x06//, (byte)0x00,                         //0 payloadLength
                                                               //1 payload
               //(byte)0x03, (byte)0x81, (byte)0x00, (byte)0x40, (byte)0x03, (byte)0x80 
               }));

      try {
         assertEquals(expectedStatus, payloadParser.parseFile(testInputStream, "testLogFile.bin"));
         assertEquals(expectedStep, payloadParser.getStep());
      } catch (FileParserException e) {
         fail("Unexpected exception: " + e);
      }
   }

   /**
    * Step 10 test without enough bytes. Should return PARTIAL.
    */
   @Test
   public void testPayloadPartial() {

      ParserStatus expectedStatus = ParserStatus.PARTIAL;
      int expectedStep = 1;

      BufferedInputStream testInputStream = new BufferedInputStream(
         new ByteArrayInputStream(new byte[] { 
               (byte)0x06, (byte)0x00,                         //0 payloadLength
                                                               //1 payload
               (byte)0x03, (byte)0x81//, (byte)0x00, (byte)0x40, (byte)0x03, (byte)0x80 
               }));

      try {
         assertEquals(expectedStatus, payloadParser.parseFile(testInputStream, "testLogFile.bin"));
         assertEquals(expectedStep, payloadParser.getStep());
      } catch (FileParserException e) {
         fail("Unexpected exception: " + e);
      }
   }

}
