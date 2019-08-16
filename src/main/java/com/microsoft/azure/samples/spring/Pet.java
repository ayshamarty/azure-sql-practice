/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import org.springframework.data.annotation.Id;

public class Pet {
	@Id
	private Integer anprId;

	private String streetName;

	private String latitude;

	private String longitude;

	@Override
	public String toString() {
		return "Pet{" + "id=" + anprId + ", stree='" + streetName + '\'' + ", latitude='" + latitude + '\''
				+ ", longitude='" + longitude + '\'' + '}';
	}
}
