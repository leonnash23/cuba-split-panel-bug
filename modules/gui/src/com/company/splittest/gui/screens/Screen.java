package com.company.splittest.gui.screens;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class Screen extends AbstractWindow {

    @Inject
    private GridLayout mainGrid;

    @Inject
    private ComponentsFactory componentFactory;

    private GridLayout innerGrid;

    private BoxLayout stopLayout;


    @Override
    public void init(Map<String, Object> params) {
        smallerInit();
    }

    private void smallerInit() {
        innerGrid = componentFactory.createComponent(GridLayout.class);
        innerGrid.setWidth("100%");
        innerGrid.setHeight(Component.AUTO_SIZE);
        innerGrid.setSpacing(true);
        innerGrid.setColumns(2);

        SplitPanel mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);

        Label label = componentFactory.createComponent(Label.class);
        label.setValue("text");
        mainSplit.add(label);

        LookupField lookupField = componentFactory.createComponent(LookupField.class);
        mainSplit.add(lookupField);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);

        label = componentFactory.createComponent(Label.class);
        label.setValue("text");
        mainSplit.add(label);

        lookupField = componentFactory.createComponent(LookupField.class);
        mainSplit.add(lookupField);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);

        label = componentFactory.createComponent(Label.class);
        label.setValue("text");
        mainSplit.add(label);

        lookupField = componentFactory.createComponent(LookupField.class);
        mainSplit.add(lookupField);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);

        label = componentFactory.createComponent(Label.class);
        label.setValue("text");
        mainSplit.add(label);

        lookupField = componentFactory.createComponent(LookupField.class);
        mainSplit.add(lookupField);

        innerGrid.add(mainSplit);

        mainGrid.add(innerGrid);
    }

    private void fullyInit() {
        stopLayout = componentFactory.createComponent(VBoxLayout.class);
        stopLayout.setWidth("100%");
        stopLayout.setSpacing(true);


        innerGrid = componentFactory.createComponent(GridLayout.class);
        innerGrid.setWidth("100%");
        innerGrid.setHeight(Component.AUTO_SIZE);
        innerGrid.setSpacing(true);
        innerGrid.setColumns(2);

        stopLayout.add(innerGrid);


        SplitPanel mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);
        Label label = componentFactory.createComponent(Label.class);
        label.setWidth(Component.AUTO_SIZE);
        label.setValue("Text");
        label.setAlignment(Alignment.MIDDLE_LEFT);

        BoxLayout labelBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        labelBoxLayout.setWidthFull();
        labelBoxLayout.add(label);
        mainSplit.add(labelBoxLayout);

        LookupField lookupField = componentFactory.createComponent(LookupField.class);
        lookupField.setWidth("100%");
        lookupField.setHeightAuto();

        BoxLayout lookupBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        lookupBoxLayout.setWidthFull();
        lookupBoxLayout.add(lookupField);
        mainSplit.add(lookupBoxLayout);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);
        label = componentFactory.createComponent(Label.class);
        label.setWidth(Component.AUTO_SIZE);
        label.setValue("Text");
        label.setAlignment(Alignment.MIDDLE_LEFT);

        labelBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        labelBoxLayout.setWidthFull();
        labelBoxLayout.add(label);
        mainSplit.add(labelBoxLayout);

        lookupField = componentFactory.createComponent(LookupField.class);
        lookupField.setWidth("100%");
        lookupField.setHeightAuto();

        lookupBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        lookupBoxLayout.setWidthFull();
        lookupBoxLayout.add(lookupField);
        mainSplit.add(lookupBoxLayout);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);
        label = componentFactory.createComponent(Label.class);
        label.setWidth(Component.AUTO_SIZE);
        label.setValue("Text");
        label.setAlignment(Alignment.MIDDLE_LEFT);

        labelBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        labelBoxLayout.setWidthFull();
        labelBoxLayout.add(label);
        mainSplit.add(labelBoxLayout);

        lookupField = componentFactory.createComponent(LookupField.class);
        lookupField.setWidth("100%");
        lookupField.setHeightAuto();

        lookupBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        lookupBoxLayout.setWidthFull();
        lookupBoxLayout.add(lookupField);
        mainSplit.add(lookupBoxLayout);

        innerGrid.add(mainSplit);

        mainSplit = componentFactory.createComponent(SplitPanel.class);
        mainSplit.setOrientation(SplitPanel.ORIENTATION_HORIZONTAL);
        mainSplit.setHeight("29px");
        mainSplit.setWidthFull();
        mainSplit.setSplitPosition(23);
        mainSplit.setLocked(true);
        mainSplit.setSettingsEnabled(false);
        label = componentFactory.createComponent(Label.class);
        label.setWidth(Component.AUTO_SIZE);
        label.setValue("Text");
        label.setAlignment(Alignment.MIDDLE_LEFT);

        labelBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        labelBoxLayout.setWidthFull();
        labelBoxLayout.add(label);
        mainSplit.add(labelBoxLayout);

        lookupField = componentFactory.createComponent(LookupField.class);
        lookupField.setWidth("100%");
        lookupField.setHeightAuto();

        lookupBoxLayout = componentFactory.createComponent(HBoxLayout.class);
        lookupBoxLayout.setWidthFull();
        lookupBoxLayout.add(lookupField);
        mainSplit.add(lookupBoxLayout);

        innerGrid.add(mainSplit);
        mainGrid.add(stopLayout);
    }

    public void repaint() {
        innerGrid.removeAll();
        mainGrid.removeAll();
        init(null);
    }
}