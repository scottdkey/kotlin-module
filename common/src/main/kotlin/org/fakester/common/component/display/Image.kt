package org.fakester.common.component.display

import com.inductiveautomation.ignition.common.jsonschema.JsonSchema;
import com.inductiveautomation.perspective.common.api.ComponentDescriptor;
import com.inductiveautomation.perspective.common.api.ComponentDescriptorImpl;
import org.fakester.common.RadComponents;

class Image {
  val radComponent = RadComponents()
  val COMPONENT_ID = "rad.display.image"
  val SCHEMA : JsonSchema = JsonSchema.parse(javaClass.getResourceAsStream("/radimage.props.json"))
  val DESCRIPTOR :ComponentDescriptor = ComponentDescriptorImpl.ComponentBuilder
    .newBuilder()
    .withId(COMPONENT_ID)
    .withModuleId(radComponent.MODULE_ID)
    .withSchema(SCHEMA)
    .withDefaultMetaName("Rad Image")
    .withPaletteName("Rad Image")
    .withPaletteDescription("A Simple Image Component.")
    .withPaletteName(radComponent.COMPONENT_CATEGORY)
    .withResources(radComponent.BROWSER_RESOURCES)
    .build()
}