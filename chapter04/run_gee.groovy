#!/usr/bin/env groovy

import org.codehaus.groovy.control.*
String.metaClass.search = { Closure c -> GeeTwitterScript.search(delegate,c) }
if(args) {
	def conf = new CompilerConfiguration()
	conf.setScriptBaseClass("GeeTwitterScript")
	def shell = new GroovyShell(conf)
	shell.evaluate (new File(args[0]))
}
else
	println "Usage: GeeTwitter <script>"