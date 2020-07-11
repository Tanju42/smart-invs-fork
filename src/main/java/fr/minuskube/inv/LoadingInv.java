package fr.minuskube.inv;

import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public class LoadingInv implements InventoryProvider {

	public static SmartInventory getInv(Integer Rows, InventoryManager manager) {
		SmartInventory inv = SmartInventory.builder().id("LOADING")
				.title(ChatColor.translateAlternateColorCodes('&', "&eLoading...")).closeable(false)
				.manager(manager).size(Rows, 9).provider(new LoadingInv()).build();
		return inv;
	}

	@Override
	public void update(Player p, InventoryContents contents) {
	}

	@Override
	public void init(Player player, InventoryContents contents) {
	}
}
