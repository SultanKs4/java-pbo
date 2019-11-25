package org.loss.maps.model.img;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifSubIFDDescriptor;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDescriptor;
import com.drew.metadata.exif.GpsDirectory;
import com.drew.metadata.file.FileSystemDescriptor;
import com.drew.metadata.file.FileSystemDirectory;

import java.io.File;
import java.io.IOException;

public class imgMetadata {
    private void MetadataExtract() {
        File jpgFile = new File("img//IMG_20190622_153644.jpg");
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(jpgFile);
            ExifSubIFDDirectory dir = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
            ExifSubIFDDescriptor desc = new ExifSubIFDDescriptor(dir);
            GpsDirectory gpsDir = metadata.getFirstDirectoryOfType(GpsDirectory.class);
            GpsDescriptor gpsDesc = new GpsDescriptor(gpsDir);
            FileSystemDescriptor fDesc = new FileSystemDescriptor(metadata.getFirstDirectoryOfType(FileSystemDirectory.class));
            System.out.println(fDesc.getDescription(2));
            System.out.println(gpsDesc.getGpsLongitudeDescription());
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.println(tag);
                }
            }
        } catch (ImageProcessingException | IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        imgMetadata img = new imgMetadata();
        img.MetadataExtract();
    }
}
