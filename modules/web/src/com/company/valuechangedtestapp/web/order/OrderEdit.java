package com.company.valuechangedtestapp.web.order;

import com.company.valuechangedtestapp.entity.Order;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.PickerField;

import javax.inject.Named;
import java.util.Map;

public class OrderEdit extends AbstractEditor<Order> {

    @Named("fieldGroup.customer")
    PickerField customer;


    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        customer.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                showNotification("e.value: " + e.getValue(), NotificationType.HUMANIZED);
            } else {
                showNotification("e.value is null", NotificationType.ERROR);
            }
        });
    }
}