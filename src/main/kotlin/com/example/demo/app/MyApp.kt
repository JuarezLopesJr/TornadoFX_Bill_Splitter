package com.example.demo.app

import com.example.demo.view.MainView
import javafx.stage.Stage
import tornadofx.*

class MyApp: App(MainView::class, Styles::class) {

    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
    }

    override fun start(stage: Stage) {
        with(stage) {
            isResizable = false
            width = 300.0
            height = 300.0
        }


        super.start(stage)
    }
}