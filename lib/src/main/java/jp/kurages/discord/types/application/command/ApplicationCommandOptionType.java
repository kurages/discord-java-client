package jp.kurages.discord.types.application.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApplicationCommandOptionType {
	SUB_COMMAND(1),
	SUB_COMMAND_GROUP(2),
	STRING(3),
	INTEGER(4),
	BOOLEAN(5),
	USER(6),
	CHANNEL(7),
	ROLE(8),
	MENTIONABLE(9),
	NUMBER(10),
	ATTACHMENT(11);

	private int value;
}
