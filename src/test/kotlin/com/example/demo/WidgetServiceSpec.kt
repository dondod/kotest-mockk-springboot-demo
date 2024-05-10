package com.example.demo

import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(
    classes = [WidgetService::class]
)
class WidgetServiceSpec(
    private val widgetService: WidgetService,
    @MockkBean private val widgetDb: WidgetDb
) : DescribeSpec({
    describe("getWidgets") {
        every { widgetDb.getWidgets() } returns listOf(Widget(5), Widget(6))

        it("returns the mocked widgets") {
            val widgets = widgetService.getWidgets()
            widgets.shouldBe(listOf(Widget(5), Widget(6)))
        }

        it("still returns the mocked widgets") {
            val widgets = widgetService.getWidgets()
            widgets.shouldBe(listOf(Widget(5), Widget(6)))
        }
    }
})
