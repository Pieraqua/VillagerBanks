package pieraqua.villagerbanks.common;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(VillagerBanks.MODID)
public class VillagerBanks {
    public static final String MODID = "villagerbanks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VillagerBanks() {
        LOGGER.info("Villager Banks mod is here!!!!");
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
