package model

public enum PredefinedListUploadEnum {
	APPEND(0, 'Append'),
	REPLACE(1, 'Replace')

	final Integer value
	final String label

	PredefinedListUploadEnum(int value, String label) {
		this.value = value
		this.label = label
	}

	static PredefinedListUploadEnum fromLabel(String label) {
		for (PredefinedListUploadEnum option : values()) {
			if (option.label.equalsIgnoreCase(label)) {
				return option
			}
		}
		return PredefinedListUploadEnum.APPEND
	}
}