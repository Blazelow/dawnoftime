package org.dawnoftime.dawnoftime.platform;

import net.minecraftforge.fml.ModList;
import org.dawnoftime.dawnoftime.platform.services.IPlatformHelper;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
