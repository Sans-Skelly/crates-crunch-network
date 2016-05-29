package com.crunchnetwork.crates;



import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import com.crunchnetwork.crates.CratesGUI;
import com.crunchnetwork.crates.CratesGUI.OptionClickEventHandler;

import com.crunchnetwork.crates.CratesGUI_EXE;;

@SuppressWarnings("unused")
public class Crates extends JavaPlugin implements Listener {
	
	
	@Override
	public void onEnable() 
	{
	    Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player player = (Player)sender;
			if (commandLabel.equalsIgnoreCase("crates"))
		      if (args.length == 0)
		      {
		        player.sendMessage("§8§m------------------------------------------------");
		        player.sendMessage("§8[§aCrates§8]§3 §7§l» §f§o " + getDescription().getVersion());
		        player.sendMessage("§7Created by &6Crunch Network Dev Team");
		        player.sendMessage("§8§m------------------------------------------------");
		      }
	
		      else if (args[0].equalsIgnoreCase("help"))
		      {
		    	player.sendMessage("§8§m------------------------------------------------");
		        player.sendMessage("§6Crates §3Help");
		        player.sendMessage("§7§o/crates §8§o» §c§oThe About Page");
		        player.sendMessage("§7§o/crates help §8§o» §c§oThe Help Page");
		        player.sendMessage("§7§o/crates reload §8§o» §c§oReloads Plugin");
		        player.sendMessage("§7§o/crates §8§o» §c§oThe About Page");
		        player.sendMessage("§7§o/crates create <name> §8§o» §c§oStarts Crates Creation");
		        player.sendMessage("§7§o/crates edit §8§o» §c§oEdits default template");
		        player.sendMessage("§7§o/crates delete <name> §8§o» §c§oRemoves a crate");
		        player.sendMessage("§7§o/crates create key <name> <crates name> §8§o» §c§oCreates a key for your crate");
		        player.sendMessage("§7§o/crates chest set §8§o» §c§oSets the chest for the crate");
		        player.sendMessage("§8§m------------------------------------------------");
		      }
		    
		      else if (args[0].equalsIgnoreCase("create"))
		    	  
		    	 player.sendMessage("Crate Created");
			     return new CratesGUI_EXE().main(sender, commandLabel, args, this);
	}
}

	  
		    	  
	

