package com.skm.kotlin.designer

import com.griffithindustries.kotlin.common.*
import com.inductiveautomation.ignition.common.licensing.*
import com.inductiveautomation.ignition.common.script.*
import com.inductiveautomation.ignition.common.script.hints.*
import com.inductiveautomation.ignition.designer.model.*
import com.skm.kotlin.common.FastExcelWrapper

class KotlinExampleDesignerHook : AbstractDesignerModuleHook() {
    override fun initializeScriptManager(manager: ScriptManager) {
        manager.addScriptModule("system.excel", FastExcelWrapper, PropertiesFileDocProvider())
    }
}
