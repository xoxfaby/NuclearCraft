package nc.util;

import java.lang.Math;
import nc.config.NCConfig;
import nc.ModCheck;

public class EnergyHelper {
	
	public static int getEUTier(double powerRF) {
		double euPerTick = powerRF / (double) NCConfig.rf_per_eu;
		int maxTier = ModCheck.gregtechLoaded() ? 10 : 4;
		return (int) Math.min( Math.ceil(((Math.log(euPerTick)/Math.log(2)) - 3 ) / 2) , maxTier );
	}
	
	public static int getMaxEUFromTier(int tier) {
		return (int) Math.pow(2, 2*tier + 3);
	}
}
