/*
 * EnJ - EnOcean Java API
 * 
 * Copyright 2014 Andrea Biasi, Dario Bonino 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package it.polito.elite.enocean.enj.eep.eep26.attributes;

import it.polito.elite.enocean.enj.eep.EEPAttribute;

/**
 * @author bonino
 *
 */
public class EEP26RockerSwitch2RockerButtonCount extends EEPAttribute<Integer>
{

	// the attribute name
	public static final String NAME = "EEP26RockerSwitch2RockerButtonCount";

	/**
	 * @param name
	 */
	public EEP26RockerSwitch2RockerButtonCount()
	{
		super(EEP26RockerSwitch2RockerButtonCount.NAME);

		// default value 0
		this.value = 0;
	}

	public EEP26RockerSwitch2RockerButtonCount(int buttonCount)
	{
		super(EEP26RockerSwitch2RockerButtonCount.NAME);

		// default value 0
		this.value = buttonCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.polito.elite.enocean.enj.eep.EEPAttribute#byteValue()
	 */
	@Override
	public byte[] byteValue()
	{
		// not used for rocker switches		
		return new byte[]{this.value.byteValue()};
	}

}
