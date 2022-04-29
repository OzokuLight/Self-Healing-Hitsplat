package com.SelfHealingNotifications;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("SelfHealingNotifications")
public interface SelfHealingNotificationsConfig extends Config
{
	@ConfigItem(
			keyName = "sendToChar",
			name = "Display above character",
			description = "Display healing in above character"
	)
	default boolean sendToChar()
	{
		return true;
	}
	@ConfigItem(
			keyName = "ignoreRegen",
			name = "Ignores 1hp regen or heals",
			description = "Ignores all healing that is 1hp"
	)
	default boolean ignoreRegen()
	{
		return true;
	}
}
