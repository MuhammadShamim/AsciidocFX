package com.kodcu.service.extension.chart;

import com.kodcu.config.ExtensionConfigBean;
import com.kodcu.controller.ApplicationController;
import com.kodcu.other.Current;
import com.kodcu.service.ThreadService;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by usta on 31.03.2015.
 */
@Component("scatter-bean")
public class ScatterChartBuilderService extends XYChartBuilderService {

    public ScatterChartBuilderService(ThreadService threadService, Current current, ApplicationController controller, ExtensionConfigBean extensionConfigBean) {
        super(threadService, current, controller, extensionConfigBean);
    }

    @Override
    protected XYChart<String, Number> createXYChart() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final XYChart<String, Number> chart = new ScatterChart<String, Number>(xAxis, yAxis);
        chart.getStyleClass().add("chart-extension");
        return chart;
    }


}
