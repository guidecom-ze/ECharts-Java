package org.icepear.echarts.charts.radar;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.radar.RadarEmphasisOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class RadarEmphasis implements RadarEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String focus;

    private LineStyleOption lineStyle;

    private AreaStyleOption areaStyle;

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private Object blurScope;
}
