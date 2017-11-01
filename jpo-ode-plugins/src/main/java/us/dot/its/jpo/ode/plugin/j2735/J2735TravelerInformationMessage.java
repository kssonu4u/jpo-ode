package us.dot.its.jpo.ode.plugin.j2735;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.annotations.Expose;

import us.dot.its.jpo.ode.model.OdeObject;

public class J2735TravelerInformationMessage extends OdeObject {
   private static final long serialVersionUID = -200529140190872305L;

   @Expose
   private int msgCnt;
   @Expose
   private int index;
   @Expose
   private String timeStamp;
   @Expose
   private int packetID;
   @Expose
   private String urlB;
   @Expose
   private DataFrame[] dataframes;
   @Expose(serialize = false, deserialize = true)
   private JsonNode asnDataFrames;

   public int getMsgCnt() {
      return msgCnt;
   }

   public void setMsgCnt(int msgCnt) {
      this.msgCnt = msgCnt;
   }

   public String getTimeStamp() {
      return timeStamp;
   }

   public void setTimeStamp(String timeStamp) {
      this.timeStamp = timeStamp;
   }

   public int getPacketID() {
      return packetID;
   }

   public void setPacketID(int packetID) {
      this.packetID = packetID;
   }

   public DataFrame[] getDataframes() {
      return dataframes;
   }

   public void setDataframes(DataFrame[] dataframes) {
      this.dataframes = dataframes;
   }

   public String getUrlB() {
      return urlB;
   }

   public void setUrlB(String urlB) {
      this.urlB = urlB;
   }

   public int getIndex() {
      return index;
   }

   public void setIndex(int index) {
      this.index = index;
   }

   public JsonNode  getAsnDataFrames() {
      return asnDataFrames;
   }

   public void setAsnDataFrames(JsonNode stringDataFrames) {
      this.asnDataFrames = stringDataFrames;
   }

   public static class ComputedLane extends OdeObject {

      private static final long serialVersionUID = 7337344402648755924L;
      private int laneID;
      private BigDecimal offsetSmallX;
      private BigDecimal offsetLargeX;
      private BigDecimal offsetSmallY;
      private BigDecimal offsetLargeY;
      private int angle;
      private BigDecimal xScale;
      private BigDecimal yScale;

      public int getLaneID() {
         return laneID;
      }

      public void setLaneID(int laneID) {
         this.laneID = laneID;
      }

      public BigDecimal getOffsetSmallX() {
         return offsetSmallX;
      }

      public void setOffsetSmallX(BigDecimal offsetSmallX) {
         this.offsetSmallX = offsetSmallX;
      }

      public BigDecimal getOffsetLargeX() {
         return offsetLargeX;
      }

      public void setOffsetLargeX(BigDecimal offsetLargeX) {
         this.offsetLargeX = offsetLargeX;
      }

      public BigDecimal getOffsetSmallY() {
         return offsetSmallY;
      }

      public void setOffsetSmallY(BigDecimal offsetSmallY) {
         this.offsetSmallY = offsetSmallY;
      }

      public BigDecimal getOffsetLargeY() {
         return offsetLargeY;
      }

      public void setOffsetLargeY(BigDecimal offsetLargeY) {
         this.offsetLargeY = offsetLargeY;
      }

      public int getAngle() {
         return angle;
      }

      public void setAngle(int angle) {
         this.angle = angle;
      }

      public BigDecimal getxScale() {
         return xScale;
      }

      public void setxScale(BigDecimal xScale) {
         this.xScale = xScale;
      }

      public BigDecimal getyScale() {
         return yScale;
      }

      public void setyScale(BigDecimal yScale) {
         this.yScale = yScale;
      }
   }

   public static class NodeXY extends OdeObject {

      private static final long serialVersionUID = -3250256624514759524L;
      private String delta;
      private BigDecimal nodeLat;
      private BigDecimal nodeLong;
      private BigDecimal x;
      private BigDecimal y;
      private Attributes attributes;

      public String getDelta() {
         return delta;
      }

      public void setDelta(String delta) {
         this.delta = delta;
      }

      public BigDecimal getNodeLat() {
         return nodeLat;
      }

      public void setNodeLat(BigDecimal nodeLat) {
         this.nodeLat = nodeLat;
      }

      public BigDecimal getNodeLong() {
         return nodeLong;
      }

      public void setNodeLong(BigDecimal nodeLong) {
         this.nodeLong = nodeLong;
      }

      public BigDecimal getX() {
         return x;
      }

      public void setX(BigDecimal x) {
         this.x = x;
      }

      public BigDecimal getY() {
         return y;
      }

      public void setY(BigDecimal y) {
         this.y = y;
      }

      public Attributes getAttributes() {
         return attributes;
      }

      public void setAttributes(Attributes attributes) {
         this.attributes = attributes;
      }

   }

   public static class LocalNode extends OdeObject {

      private static final long serialVersionUID = 3872400520330034244L;
      private long type;

      public long getType() {
         return type;
      }

      public void setType(long type) {
         this.type = type;
      }
   }

   public static class DisabledList extends OdeObject {

      private static final long serialVersionUID = 1009869811306803991L;
      private long type;

      public long getType() {
         return type;
      }

      public void setType(long type) {
         this.type = type;
      }
   }

   public static class EnabledList extends OdeObject {

      private static final long serialVersionUID = 5797889223766230223L;
      private long type;

      public long getType() {
         return type;
      }

      public void setType(long type) {
         this.type = type;
      }
   }

   public static class SpeedLimits extends OdeObject {

      private static final long serialVersionUID = -8729406522600137038L;
      private long type;
      private BigDecimal velocity;

      public long getType() {
         return type;
      }

      public void setType(long type) {
         this.type = type;
      }

      public BigDecimal getVelocity() {
         return velocity;
      }

      public void setVelocity(BigDecimal velocity) {
         this.velocity = velocity;
      }
   }

   public static class DataList extends OdeObject {

      private static final long serialVersionUID = -1391200532738540024L;
      private int pathEndpointAngle;
      private BigDecimal laneCrownCenter;
      private BigDecimal laneCrownLeft;
      private BigDecimal laneCrownRight;
      private BigDecimal laneAngle;
      private SpeedLimits[] speedLimits;

      public int getPathEndpointAngle() {
         return pathEndpointAngle;
      }

      public void setPathEndpointAngle(int pathEndpointAngle) {
         this.pathEndpointAngle = pathEndpointAngle;
      }

      public BigDecimal getLaneCrownCenter() {
         return laneCrownCenter;
      }

      public void setLaneCrownCenter(BigDecimal laneCrownCenter) {
         this.laneCrownCenter = laneCrownCenter;
      }

      public BigDecimal getLaneCrownLeft() {
         return laneCrownLeft;
      }

      public void setLaneCrownLeft(BigDecimal laneCrownLeft) {
         this.laneCrownLeft = laneCrownLeft;
      }

      public BigDecimal getLaneCrownRight() {
         return laneCrownRight;
      }

      public void setLaneCrownRight(BigDecimal laneCrownRight) {
         this.laneCrownRight = laneCrownRight;
      }

      public BigDecimal getLaneAngle() {
         return laneAngle;
      }

      public void setLaneAngle(BigDecimal laneAngle) {
         this.laneAngle = laneAngle;
      }

      public SpeedLimits[] getSpeedLimits() {
         return speedLimits;
      }

      public void setSpeedLimits(SpeedLimits[] speedLimits) {
         this.speedLimits = speedLimits;
      }
   }

   public static class Attributes extends OdeObject {

      private static final long serialVersionUID = -6476758554962944513L;
      private LocalNode[] localNodes;
      private DisabledList[] disabledLists;
      private EnabledList[] enabledLists;
      private DataList[] dataLists;
      private BigDecimal dWidth;
      private BigDecimal dElevation;

      public LocalNode[] getLocalNodes() {
         return localNodes;
      }

      public void setLocalNodes(LocalNode[] localNodes) {
         this.localNodes = localNodes;
      }

      public DisabledList[] getDisabledLists() {
         return disabledLists;
      }

      public void setDisabledLists(DisabledList[] disabledLists) {
         this.disabledLists = disabledLists;
      }

      public EnabledList[] getEnabledLists() {
         return enabledLists;
      }

      public void setEnabledLists(EnabledList[] enabledLists) {
         this.enabledLists = enabledLists;
      }

      public DataList[] getDataLists() {
         return dataLists;
      }

      public void setDataLists(DataList[] dataLists) {
         this.dataLists = dataLists;
      }

      public BigDecimal getdWidth() {
         return dWidth;
      }

      public void setdWidth(BigDecimal dWidth) {
         this.dWidth = dWidth;
      }

      public BigDecimal getdElevation() {
         return dElevation;
      }

      public void setdElevation(BigDecimal dElevation) {
         this.dElevation = dElevation;
      }
   }

   public static class DataFrame extends OdeObject {

      private static final long serialVersionUID = 537503046055742396L;
      private short sspTimRights;// Start Header Information
      private int frameType;
      private String msgID;
      private String furtherInfoID;
      private OdePosition3D position;
      private String viewAngle;
      private int mutcd;
      private String crc;
      private String startDateTime;
      private int durationTime;
      private int priority;// End header Information
      private short sspLocationRights;// Start Region Information
      private Region[] regions;
      private short sspMsgTypes;// Start content Information
      private short sspMsgContent;
      private String content;
      private String[] items;
      private String url;// End content Information

      public static class Region extends OdeObject {

         private static final long serialVersionUID = 8011973280114768008L;
         private String name;
         private int regulatorID;
         private int segmentID;
         private OdePosition3D anchorPosition;
         private BigDecimal laneWidth;
         private long directionality;
         private boolean closedPath;
         private String direction;
         private String regionType;
         private String description;
         private Path path;
         private Geometry geometry;
         private OldRegion oldRegion;

         public static class OldRegion extends OdeObject {

            private static final long serialVersionUID = 1650366042178220073L;
            private String direction;
            private int extent;
            private String area;
            private ShapePoint shapepoint;
            private Circle circle;
            private RegionPoint regionPoint;

            public static class ShapePoint extends OdeObject {

               private static final long serialVersionUID = -209874574767391032L;
               private OdePosition3D position;
               private BigDecimal laneWidth;
               private int directionality;
               private String nodeType;
               private ComputedLane computedLane;
               private NodeXY[] nodexy;

               public NodeXY[] getNodexy() {
                  return nodexy;
               }

               public void setNodexy(NodeXY[] nodexy) {
                  this.nodexy = nodexy;
               }

               public ComputedLane getComputedLane() {
                  return computedLane;
               }

               public void setComputedLane(ComputedLane computedLane) {
                  this.computedLane = computedLane;
               }

               public String getNodeType() {
                  return nodeType;
               }

               public void setNodeType(String nodeType) {
                  this.nodeType = nodeType;
               }

               public int getDirectionality() {
                  return directionality;
               }

               public void setDirectionality(int directionality) {
                  this.directionality = directionality;
               }

               public BigDecimal getLaneWidth() {
                  return laneWidth;
               }

               public void setLaneWidth(BigDecimal laneWidth) {
                  this.laneWidth = laneWidth;
               }

               public OdePosition3D getPosition() {
                  return position;
               }

               public void setPosition(OdePosition3D position) {
                  this.position = position;
               }
            }

            public static class RegionPoint extends OdeObject {

               private static final long serialVersionUID = -3978458353968571032L;
               private OdePosition3D position;
               private int scale;
               private RegionList[] regionList;

               public static class RegionList extends OdeObject {

                  private static final long serialVersionUID = -5307620155601900634L;
                  private BigDecimal xOffset;
                  private BigDecimal yOffset;
                  private BigDecimal zOffset;

                  public BigDecimal getzOffset() {
                     return zOffset;
                  }

                  public void setzOffset(BigDecimal zOffset) {
                     this.zOffset = zOffset;
                  }

                  public BigDecimal getyOffset() {
                     return yOffset;
                  }

                  public void setyOffset(BigDecimal yOffset) {
                     this.yOffset = yOffset;
                  }

                  public BigDecimal getxOffset() {
                     return xOffset;
                  }

                  public void setxOffset(BigDecimal xOffset) {
                     this.xOffset = xOffset;
                  }
               }

               public RegionList[] getRegionList() {
                  return regionList;
               }

               public void setRegionList(RegionList[] regionList) {
                  this.regionList = regionList;
               }

               public int getScale() {
                  return scale;
               }

               public void setScale(int scale) {
                  this.scale = scale;
               }

               public OdePosition3D getPosition() {
                  return position;
               }

               public void setPosition(OdePosition3D position) {
                  this.position = position;
               }
            }

            public RegionPoint getRegionPoint() {
               return regionPoint;
            }

            public void setRegionPoint(RegionPoint regionPoint) {
               this.regionPoint = regionPoint;
            }

            public Circle getCircle() {
               return circle;
            }

            public void setCircle(Circle circle) {
               this.circle = circle;
            }

            public ShapePoint getShapepoint() {
               return shapepoint;
            }

            public void setShapepoint(ShapePoint shapepoint) {
               this.shapepoint = shapepoint;
            }

            public String getArea() {
               return area;
            }

            public void setArea(String area) {
               this.area = area;
            }

            public int getExtent() {
               return extent;
            }

            public void setExtent(int extent) {
               this.extent = extent;
            }

            public String getDirection() {
               return direction;
            }

            public void setDirection(String direction) {
               this.direction = direction;
            }
         }

         public static class Geometry extends OdeObject {

            private static final long serialVersionUID = -7664796173893464468L;
            private String direction;
            private int extent;
            private BigDecimal laneWidth;
            private Circle circle;

            public Circle getCircle() {
               return circle;
            }

            public void setCircle(Circle circle) {
               this.circle = circle;
            }

            public BigDecimal getLaneWidth() {
               return laneWidth;
            }

            public void setLaneWidth(BigDecimal laneWidth) {
               this.laneWidth = laneWidth;
            }

            public int getExtent() {
               return extent;
            }

            public void setExtent(int extent) {
               this.extent = extent;
            }

            public String getDirection() {
               return direction;
            }

            public void setDirection(String direction) {
               this.direction = direction;
            }
         }

         public static class Circle extends OdeObject {

            private static final long serialVersionUID = -8156052898034497978L;
            private OdePosition3D position;
            private int radius;
            private int units;

            public int getUnits() {
               return units;
            }

            public void setUnits(int units) {
               this.units = units;
            }

            public int getRadius() {
               return radius;
            }

            public void setRadius(int radius) {
               this.radius = radius;
            }

            public OdePosition3D getPosition() {
               return position;
            }

            public void setPosition(OdePosition3D position) {
               this.position = position;
            }
         }

         public static class Path extends OdeObject {

            private static final long serialVersionUID = 3293758823626661508L;
            private int scale;
            private String type;
            private NodeXY[] nodes;
            private ComputedLane computedLane;

            public ComputedLane getComputedLane() {
               return computedLane;
            }

            public void setComputedLane(ComputedLane computedLane) {
               this.computedLane = computedLane;
            }

            public NodeXY[] getNodes() {
               return nodes;
            }

            public void setNodes(NodeXY[] nodes) {
               this.nodes = nodes;
            }

            public String getType() {
               return type;
            }

            public void setType(String type) {
               this.type = type;
            }

            public int getScale() {
               return scale;
            }

            public void setScale(int scale) {
               this.scale = scale;
            }

         }

         public OldRegion getOldRegion() {
            return oldRegion;
         }

         public void setOldRegion(OldRegion oldRegion) {
            this.oldRegion = oldRegion;
         }

         public Geometry getGeometry() {
            return geometry;
         }

         public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
         }

         public Path getPath() {
            return path;
         }

         public void setPath(Path path) {
            this.path = path;
         }

         public String getDescription() {
            return description;
         }

         public void setDescription(String description) {
            this.description = description;
         }

         public String getregionType() {
            return regionType;
         }

         public void setregionType(String regionType) {
            this.regionType = regionType;
         }

         public String getDirection() {
            return direction;
         }

         public void setDirection(String direction) {
            this.direction = direction;
         }

         public boolean isClosedPath() {
            return closedPath;
         }

         public void setClosedPath(boolean closedPath) {
            this.closedPath = closedPath;
         }

         public long getDirectionality() {
            return directionality;
         }

         public void setDirectionality(long directionality) {
            this.directionality = directionality;
         }

         public BigDecimal getLaneWidth() {
            return laneWidth;
         }

         public void setLaneWidth(BigDecimal laneWidth) {
            this.laneWidth = laneWidth;
         }

         public OdePosition3D getAnchorPosition() {
            return anchorPosition;
         }

         public void setAnchorPosition(OdePosition3D anchorPosition) {
            this.anchorPosition = anchorPosition;
         }

         public int getSegmentID() {
            return segmentID;
         }

         public void setSegmentID(int segmentID) {
            this.segmentID = segmentID;
         }

         public int getRegulatorID() {
            return regulatorID;
         }

         public void setRegulatorID(int regulatorID) {
            this.regulatorID = regulatorID;
         }

         public String getName() {
            return name;
         }

         public void setName(String name) {
            this.name = name;
         }

      }

      public String getUrl() {
         return url;
      }

      public void setUrl(String url) {
         this.url = url;
      }

      public String[] getItems() {
         return items;
      }

      public void setItems(String[] items) {
         this.items = items;
      }

      public String getContent() {
         return content;
      }

      public void setContent(String content) {
         this.content = content;
      }

      public short getsspMsgContent() {
         return sspMsgContent;
      }

      public void setsspMsgContent(short sspMsgContent) {
         this.sspMsgContent = sspMsgContent;
      }

      public short getsspMsgTypes() {
         return sspMsgTypes;
      }

      public void setsspMsgTypes(short sspMsgTypes) {
         this.sspMsgTypes = sspMsgTypes;
      }

      public Region[] getRegions() {
         return regions;
      }

      public void setRegions(Region[] regions) {
         this.regions = regions;
      }

      public short getsspLocationRights() {
         return sspLocationRights;
      }

      public void setsspLocationRights(short sspLocationRights) {
         this.sspLocationRights = sspLocationRights;
      }

      public int getPriority() {
         return priority;
      }

      public void setPriority(int priority) {
         this.priority = priority;
      }

      public int getDurationTime() {
         return durationTime;
      }

      public void setDurationTime(int durationTime) {
         this.durationTime = durationTime;
      }

      public String getStartDateTime() {
         return startDateTime;
      }

      public void setStartDateTime(String startDateTime) {
         this.startDateTime = startDateTime;
      }

      public String getCrc() {
         return crc;
      }

      public void setCrc(String crc) {
         this.crc = crc;
      }

      public int getMutcd() {
         return mutcd;
      }

      public void setMutcd(int mutcd) {
         this.mutcd = mutcd;
      }

      public String getViewAngle() {
         return viewAngle;
      }

      public void setViewAngle(String viewAngle) {
         this.viewAngle = viewAngle;
      }

      public String getMsgID() {
         return msgID;
      }

      public void setMsgID(String msgID) {
         this.msgID = msgID;
      }

      public int getFrameType() {
         return frameType;
      }

      public void setFrameType(int frameType) {
         this.frameType = frameType;
      }

      public short getsspTimRights() {
         return sspTimRights;
      }

      public void setsspTimRights(short sspTimRights) {
         this.sspTimRights = sspTimRights;
      }

      public OdePosition3D getPosition() {
         return position;
      }

      public void setPosition(OdePosition3D position) {
         this.position = position;
      }

      public String getFurtherInfoID() {
         return furtherInfoID;
      }

      public void setFurtherInfoID(String furtherInfoID) {
         this.furtherInfoID = furtherInfoID;
      }

   }

}
