package org.loss.maps.backend.maps;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.cache.FileBasedLocalCache;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

import javax.swing.event.MouseInputListener;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maps1841720019Sultan {
    private int width;
    private int height;

    public Maps1841720019Sultan(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public JXMapViewer initMaps() {
        // Create a TileFactoryInfo for OSM
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        tileFactory.setThreadPoolSize(8);

        // Setup local file cache
        File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
        tileFactory.setLocalCache(new FileBasedLocalCache(cacheDir, false));

        // Setup JXMapViewer
        JXMapViewer mapViewer = new JXMapViewer();
        mapViewer.setTileFactory(tileFactory);

        GeoPosition frankfurt = new GeoPosition(50, 7, 0, 8, 41, 0);
        GeoPosition wiesbaden = new GeoPosition(50, 5, 0, 8, 14, 0);
        GeoPosition mainz = new GeoPosition(50, 0, 0, 8, 16, 0);
        GeoPosition darmstadt = new GeoPosition(49, 52, 0, 8, 39, 0);
        GeoPosition offenbach = new GeoPosition(50, 6, 0, 8, 46, 0);

        // Set the focus
        mapViewer.setZoom(10);
        mapViewer.setAddressLocation(frankfurt);

        // Add interactions
        MouseInputListener mia = new PanMouseInputListener(mapViewer);
        mapViewer.addMouseListener(mia);
        mapViewer.addMouseMotionListener(mia);
        mapViewer.addMouseListener(new CenterMapListener(mapViewer));
        mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
        mapViewer.addKeyListener(new PanKeyListener(mapViewer));

        // Create waypoints from the geo-positions
        Set<SwingWaypoint1841720019Sultan> waypoints = new HashSet<SwingWaypoint1841720019Sultan>(Arrays.asList(
                new SwingWaypoint1841720019Sultan("Frankfurt", frankfurt),
                new SwingWaypoint1841720019Sultan("Wiesbaden", wiesbaden),
                new SwingWaypoint1841720019Sultan("Mainz", mainz),
                new SwingWaypoint1841720019Sultan("Darmstadt", darmstadt),
                new SwingWaypoint1841720019Sultan("Offenbach", offenbach)));

        // Set the overlay painter
        WaypointPainter<SwingWaypoint1841720019Sultan> swingWaypointPainter = new SwingWaypointOverlayPainter1841720019Sultan();
        swingWaypointPainter.setWaypoints(waypoints);
        mapViewer.setOverlayPainter(swingWaypointPainter);

        // Add the JButtons to the map viewer
        for (SwingWaypoint1841720019Sultan w : waypoints) {
            mapViewer.add(w.getButton());
        }

        mapViewer.setSize(width, height);

        return mapViewer;
    }
}
