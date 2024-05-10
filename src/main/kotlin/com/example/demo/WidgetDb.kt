package com.example.demo

import org.springframework.stereotype.Component

@Component
class WidgetDb {
    fun getWidgets(): List<Widget> {
        return listOf(Widget(1), Widget(2), Widget(3))
    }
}