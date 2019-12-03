package org.loss.maps.backend.img;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.GpsDescriptor;
import com.drew.metadata.exif.GpsDirectory;

import java.io.File;
import java.io.IOException;

public class ImgMetadata1841720019Sultan {
    private Metadata mMetadata;
    private File mImgFile;
    private long mSize;
    private String mLat;
    private String mLng;
    private String mAlt;
    private String mTestPath = "img//test.jpg";

    public ImgMetadata1841720019Sultan(String pathname) {
        mImgFile = new File(pathname);
        try {
            mMetadata = ImageMetadataReader.readMetadata(mImgFile);
            Gps();
        } catch (ImageProcessingException | IOException e) {
            e.printStackTrace();
        }

    }

    public long getmSize() {
        return mSize;
    }

    public String getmLat() {
        return mLat;
    }

    public String getmLng() {
        return mLng;
    }

    public String getmAlt() {
        return mAlt;
    }

    private void Gps() {
        GpsDescriptor gpsDesc = new GpsDescriptor(mMetadata.getFirstDirectoryOfType(GpsDirectory.class));
        String latitude = gpsDesc.getGpsLatitudeDescription();
        String longitude = gpsDesc.getGpsLongitudeDescription();
        mSize = mImgFile.length() / 1024;
        mLat = location(latitude);
        mLng = location(longitude);
        mAlt = gpsDesc.getGpsAltitudeDescription() + " above " + gpsDesc.getGpsAltitudeRefDescription();
    }

    private String location(String location) {
        int degreePos = 0;
        int minutesPos = 0;
        int secondPos = 0;
        double degree;
        double minute;
        double second;
        String degreeTmp = "";
        String minuteTmp = "";
        String secondTmp = "";
        for (int i = 0; i < location.length(); i++) {
            String tmp = String.valueOf(location.charAt(i));
            switch (tmp) {
                case "°":
                    degreePos = i;
                    break;
                case "'":
                    minutesPos = i;
                    break;
                case "\"":
                    secondPos = i;
                    break;
            }
        }
        for (int j = 0; j < degreePos; j++) {
            degreeTmp += String.valueOf(location.charAt(j));
        }
        for (int j = degreePos + 1; j < minutesPos; j++) {
            minuteTmp += String.valueOf(location.charAt(j));
        }
        for (int j = minutesPos + 1; j < secondPos; j++) {
            secondTmp += String.valueOf(location.charAt(j));
        }
        degree = Double.parseDouble(degreeTmp);
        minute = Double.parseDouble(minuteTmp);
        second = Double.parseDouble(secondTmp);
        double dd = degree + (minute / 60) + (second / 3600);
        if (degree < 0) {
            degree = Math.abs(degree);
            dd = degree + (minute / 60) + (second / 3600);
            dd = -dd;
        }
        return String.valueOf(dd);
    }
}
