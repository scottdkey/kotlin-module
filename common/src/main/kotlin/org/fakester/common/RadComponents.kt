package org.fakester.common

import com.inductiveautomation.perspective.common.api.BrowserResource

class RadComponents {
  val MODULE_ID : String = "org.fakester.radcomponents";
  val URL_ALIAS : String = "radcomponents";
  val COMPONENT_CATEGORY : String = "Skm Core";
  private val jsFile : BrowserResource =
    BrowserResource(
      "rad-components-js",
      String.format("/res/%s/RadComponents.js", URL_ALIAS),
      BrowserResource.ResourceType.JS)
  private val cssFile: BrowserResource =
    BrowserResource(
      "rad-components-css",
      String.format("/res/%s/RadComponents.css", URL_ALIAS),
      BrowserResource.ResourceType.CSS)
  val BROWSER_RESOURCES = setOf<BrowserResource>(jsFile, cssFile)
}