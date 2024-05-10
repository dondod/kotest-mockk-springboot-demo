package com.example.demo

import org.springframework.stereotype.Service

@Service
class WidgetService(val widgetDb: WidgetDb) {
    fun getWidgets(): List<Widget> {
        return widgetDb.getWidgets()
    }
}