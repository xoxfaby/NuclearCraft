package nc.tile.internal.heat;

import nc.tile.generator.TileFusionCore;
import org.cyclops.commoncapabilities.api.capability.temperature.ITemperature;
import net.minecraftforge.fml.common.Optional;

@Optional.Interface(iface = "org.cyclops.commoncapabilities.api.capability.temperature.ITemperature", modid = "commoncapabilities")
public class TemperatureWrapper implements ITemperature {

    public final TileFusionCore tile;

    public TemperatureWrapper(TileFusionCore tile){
        this.tile = tile;
    }

    @Override
    @Optional.Method(modid = "commoncapabilities")
    public double getTemperature() {
        return tile.heat;
    }

    @Override
    @Optional.Method(modid = "commoncapabilities")
    public double getMaximumTemperature() {
        return tile.getMaxHeat();
    }

    @Override
    @Optional.Method(modid = "commoncapabilities")
    public double getMinimumTemperature() {
        return 0;
    }

    @Override
    @Optional.Method(modid = "commoncapabilities")
    public double getDefaultTemperature() {
        return 0;
    }
}
