package org.fakester.common.component.display

import com.inductiveautomation.ignition.common.jsonschema.JsonSchema;
import com.inductiveautomation.perspective.common.api.ComponentDescriptor;
import com.inductiveautomation.perspective.common.api.ComponentDescriptorImpl;
import org.fakester.common.RadComponents;


class Button {
  val parent = RadComponents()
  val COMPONENT_ID = "rad.display.button";
  val SCHEMA: JsonSchema = JsonSchema.parse(javaClass.getResourceAsStream("/button.props.json"));
  val DESCRIPTOR : ComponentDescriptor = ComponentDescriptorImpl.ComponentBuilder
    .newBuilder()
    .withId(COMPONENT_ID)
    .withModuleId(parent.MODULE_ID)
    .withSchema(SCHEMA)
    .withDefaultMetaName("button")
    .withPaletteName("Button")
    .withPaletteDescription("A simple Button")
    .withPaletteCategory(parent.COMPONENT_CATEGORY)
    .withResources(parent.BROWSER_RESOURCES)
    .build()
}