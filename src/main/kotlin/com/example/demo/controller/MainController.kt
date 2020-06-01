package com.example.demo.controller

import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import tornadofx.*

class MainController : Controller() {
    var totalPerPerson = SimpleDoubleProperty(0.0)
    var tipPercentageAmount = SimpleDoubleProperty(0.0)
    var sliderPercentageAmount = SimpleIntegerProperty(0)

    fun calculate(
            billValue: SimpleDoubleProperty,
            splitByValue: SimpleIntegerProperty,
            tipPercValue: SimpleIntegerProperty
    ) {
        tipPercentageAmount.cleanBind((billValue * tipPercValue) / 100)
        totalPerPerson.cleanBind((tipPercentageAmount.value.toProperty() + billValue) / splitByValue)
        sliderPercentageAmount.cleanBind(tipPercValue)
    }
}