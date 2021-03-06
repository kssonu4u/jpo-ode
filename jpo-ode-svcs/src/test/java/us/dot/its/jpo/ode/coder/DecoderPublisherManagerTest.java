package us.dot.its.jpo.ode.coder;

import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Ignore;
import org.junit.Test;

import mockit.Capturing;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import us.dot.its.jpo.ode.OdeProperties;
import us.dot.its.jpo.ode.coder.stream.JsonDecoderPublisher;
import us.dot.its.jpo.ode.importer.ImporterDirectoryWatcher.ImporterFileType;

@Ignore
public class DecoderPublisherManagerTest {

   @Tested
   FileDecoderPublisher testDecoderPublisherManager;

   @Injectable
   OdeProperties injectableOdeProperties;

   @Capturing
   OdeDataPublisher capturingMessagePublisher;
   @Capturing
   JsonDecoderPublisher capturingJsonDecoderPublisher;

   @Test
   public void hexDecoderShouldDecodeHex() {
      try {
         new Expectations() {
            {
               capturingJsonDecoderPublisher.decodeAndPublish((BufferedInputStream) any, anyString, ImporterFileType.OBU_LOG_FILE);
               times = 0;
            }
         };

         Path testPath = Paths.get("testFile.hex");
         BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(new byte[] { 1 }));
         testDecoderPublisherManager.decodeAndPublishFile(testPath, bis, ImporterFileType.OBU_LOG_FILE);
      } catch (Exception e) {
         fail("Unexpected exception: " + e);
      }
   }
   
   @Test
   public void hexDecoderShouldDecodeText() {
      try {
         new Expectations() {
            {
               capturingJsonDecoderPublisher.decodeAndPublish((BufferedInputStream) any, anyString, ImporterFileType.OBU_LOG_FILE);
               times = 0;
            }
         };

         Path testPath = Paths.get("testFile.txt");
         BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(new byte[] { 1 }));
         testDecoderPublisherManager.decodeAndPublishFile(testPath, bis, ImporterFileType.OBU_LOG_FILE);
      } catch (Exception e) {
         fail("Unexpected exception: " + e);
      }
   }

   @Test
   public void jsonDecoderShouldDecodeJson() {
      try {
         new Expectations() {
            {
               capturingJsonDecoderPublisher.decodeAndPublish((BufferedInputStream) any, anyString, ImporterFileType.OBU_LOG_FILE);
               times = 1;
            }
         };

         Path testPath = Paths.get("testFile.json");
         BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(new byte[] { 1 }));
         testDecoderPublisherManager.decodeAndPublishFile(testPath, bis, ImporterFileType.OBU_LOG_FILE);
      } catch (Exception e) {
         fail("Unexpected exception: " + e);
      }
   }

   @Test
   public void binaryDecoderShouldDecodeOther() {
      try {
         new Expectations() {
            {
               capturingJsonDecoderPublisher.decodeAndPublish((BufferedInputStream) any, anyString, ImporterFileType.OBU_LOG_FILE);
               times = 0;
            }
         };

         Path testPath = Paths.get("testFile.uper");
         BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(new byte[] { 1 }));
         testDecoderPublisherManager.decodeAndPublishFile(testPath, bis, ImporterFileType.OBU_LOG_FILE);
      } catch (Exception e) {
         fail("Unexpected exception: " + e);
      }
   }

}
