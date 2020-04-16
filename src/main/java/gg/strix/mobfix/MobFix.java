package gg.strix.mobfix;

import com.google.inject.Inject;
import gg.strix.mobfix.events.MobSpawn;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "mobfix",
        name = "MobFix",
        description = "Mob fix."
)
public class MobFix {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {

        Sponge.getGame().getEventManager().registerListeners(this, new MobSpawn());

    }
}
