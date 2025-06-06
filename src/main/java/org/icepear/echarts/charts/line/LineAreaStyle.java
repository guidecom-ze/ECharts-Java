package org.icepear.echarts.charts.line;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.line.LineAreaStyleOption;

@Accessors(chain = true)
@Data
public class LineAreaStyle implements LineAreaStyleOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private String color;

    private Number opacity;

    private String origin;
}
