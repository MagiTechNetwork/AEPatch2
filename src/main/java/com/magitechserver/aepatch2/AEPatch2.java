package com.magitechserver.aepatch2;

import com.google.inject.Inject;
import com.mojang.authlib.GameProfile;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import java.util.UUID;

@Plugin(
        id = "aepatch2",
        name = "AEPatch2",
        description = "Patches some issues  from AE2 with Sponge",
        authors = {
                "Eufranio"
        }
)
public class AEPatch2 {

    public static GameProfile AE2Profile = new GameProfile(UUID.nameUUIDFromBytes("[AE2]".getBytes()), "[AE2]");

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {

    }

    @Listener
    public void onChangeBlock(ChangeBlockEvent.Break e) {
        System.out.println(e);
    }
}
