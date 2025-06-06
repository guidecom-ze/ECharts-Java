package org.icepear.echarts.components.coord.radar;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.radar.RadarIndicatorOption;

@Accessors(chain = true)
@Data
public class RadarIndicator implements RadarIndicatorOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String text;

    private Number min;

    private Number max;

    private Object color;

    private String axisType;
}
