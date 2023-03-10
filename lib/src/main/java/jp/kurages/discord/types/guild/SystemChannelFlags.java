package jp.kurages.discord.types.guild;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SystemChannelFlags {
	SUPPRESS_JOIN_NOTIFICATIONS(1 << 0),
	SUPPRESS_PREMIUM_SUBSCRIPTIONS(1 << 1),
	SUPPRESS_GUILD_REMINDER_NOTIFICATIONS(1 << 2),
	SUPPRESS_JOIN_NOTIFICATION_REPLIES(1 << 3),
	SUPPRESS_ROLE_SUBSCRIPTION_PURCHASE_NOTIFICATIONS(1 << 4),
	SUPPRESS_ROLE_SUBSCRIPTION_PURCHASE_NOTIFICATION_REPLIES(1 << 5);

	private int value;
}
