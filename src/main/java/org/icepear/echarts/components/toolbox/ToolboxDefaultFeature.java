package org.icepear.echarts.components.toolbox;

import java.io.Serializable;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxDefaultFeature implements ToolboxFeatureOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxDefaultFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxDefaultFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxDefaultFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxDefaultFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;
}
