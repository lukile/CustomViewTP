package com.example.customviewtp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView (context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.custom_component_attributes, 0, 0)

            val drawable = resources.getDrawable(typedArray
                .getResourceId(
                    R.styleable.custom_component_attributes_custom_component_image,
                    R.drawable.ciri))

            val color = resources.getColor(typedArray
                .getResourceId(R.styleable.custom_component_attributes_custom_component_color,
                    R.color.colorCiri))

            custom_view_editTxt.setTextColor(color)
            custom_view_image.setImageDrawable(drawable)


            typedArray.recycle()

        }
    }
}