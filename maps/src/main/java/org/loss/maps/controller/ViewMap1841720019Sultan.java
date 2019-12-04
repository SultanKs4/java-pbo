package org.loss.maps.controller;

import org.jxmapviewer.JXMapViewer;
import org.loss.maps.model.maps.Maps1841720019Sultan;

public class ViewMap1841720019Sultan {
    public JXMapViewer createMapSultan(int width, int height) {
        Maps1841720019Sultan maps = new Maps1841720019Sultan(width, height);
        return maps.initMaps();
    }
}
