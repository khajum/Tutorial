package com.rlimbu;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExecutionConditionDemo {

	@Test
	@EnabledOnOs(OS.WINDOWS)
	@Tag("windows")
	void onlyOnWindows() {
		System.out.println("Execute test on Windows OS only");
	}
	
	@Test
	@EnabledOnOs({OS.MAC, OS.LINUX})
	void testOnLinuxOrMac() {
		System.out.println("Execute test on Linux or Mac only.");
	}
	
	@Test
	@DisabledOnOs(OS.SOLARIS)
	@Tag("windows")
	void disableOnSolarisOnly() {
		System.out.println("Disable test on Sonaris OS.");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void testOnJre8() {
		System.out.println("Execute test on JRE8 only.");
	}
	
	@Test
	@DisabledOnJre(JRE.JAVA_8)
	void testDisableOnJre8() {
		System.out.println("Disable test execute on JRE8.");
	}

	
	@Test
	@EnabledIfSystemProperty(named="os.arch", matches=".*64.*")
	void testOnlyOn64Architecture() {
		System.out.println("Test Execute on 64-bit architectue.");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(matches="ENV", named="development")
	void testOnlyOnDevelopmentEnv() {
		System.out.println("Execute test on development environment only.");
	}
}
