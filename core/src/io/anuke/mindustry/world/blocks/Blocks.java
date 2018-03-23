package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.DrawLayer;
import io.anuke.mindustry.resource.Item;
import io.anuke.mindustry.resource.ItemStack;
import io.anuke.mindustry.resource.Liquid;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;
import io.anuke.mindustry.world.blocks.types.*;

public class Blocks{
	public static final Block
	
	air = new Block("air"){
		//no drawing here
		public void drawCache(Tile tile){}
		
		//update floor blocks for effects, if needed
		public void draw(Tile tile){}
	},

	//player/enemy spawnpoint
	spawn = new Block("spawn"){},
	
	blockpart = new BlockPart(){

	},
	
	deepwater = new Floor("deepwater"){{
		variants = 0;
		solid = true;
		liquidDrop = Liquid.water;
		liquid = true;
		drawLayer = DrawLayer.water;
	}},
	
	water = new Floor("water"){{
		variants = 0;
		solid = true;
		liquidDrop = Liquid.water;
		liquid = true;
		drawLayer = DrawLayer.water;
	}},
	
	lava = new Floor("lava"){
		{
			variants = 0;
			solid = true;
			liquidDrop = Liquid.lava;
			liquid = true;
			drawLayer = DrawLayer.lava;
		}
	},
	
	oil = new Floor("oil"){
		{
			variants = 0;
			solid = true;
			liquidDrop = Liquid.oil;
			liquid = true;
			drawLayer = DrawLayer.oil;
		}
	},
	
	stone = new Floor("stone"){{
		drops = new ItemStack(Item.stone, 1);
		blends = block -> block != this && !(block instanceof Ore);
	}},
	
	blackstone = new Floor("blackstone"){{
		drops = new ItemStack(Item.stone, 1);
	}},
	
	iron = new Ore("iron"){{
		drops = new ItemStack(Item.iron, 1);
	}},

	copper = new Ore("copper"){{
		drops = new ItemStack(Item.copper, 1);
	}},
	
	coal = new Ore("coal"){{
		drops = new ItemStack(Item.coal, 1);
	}},
	
	titanium = new Ore("titanium"){{
		drops = new ItemStack(Item.titanium, 1);
	}},
	
	uranium = new Ore("uranium"){{
		drops = new ItemStack(Item.uranium, 1);
	}},
	
	dirt = new Floor("dirt"){},
	
	sand = new Floor("sand"){{
		drops = new ItemStack(Item.silicon, 1);
	}},
	
	ice = new Floor("ice"){},
	
	snow = new Floor("snow"){},
	
	grass = new Floor("grass"){},
	
	sandblock = new StaticBlock("sandblock"){{
		solid = true;
		variants = 3;
	}},
	
	snowblock = new StaticBlock("snowblock"){{
		solid = true;
		variants = 3;
	}},
	
	stoneblock = new StaticBlock("stoneblock"){{
		solid = true;
		variants = 3;
	}},
	
	blackstoneblock = new StaticBlock("blackstoneblock"){{
		solid = true;
		variants = 3;
	}},
	
	grassblock = new StaticBlock("grassblock"){{
		solid = true;
		variants = 2;
	}},
					
	mossblock = new StaticBlock("mossblock"){{
		solid = true;
	}},
	
	shrub = new Rock("shrub"){

	},
	
	rock = new Rock("rock"){{
		variants = 2;
		varyShadow = true;
		drops = new ItemStack(Item.stone, 3);
	}},
	
	icerock = new Rock("icerock"){{
		variants = 2;
		varyShadow = true;
		drops = new ItemStack(Item.stone, 3);
	}},
	
	blackrock = new Rock("blackrock"){{
		variants = 1;
		varyShadow = true;
		drops = new ItemStack(Item.stone, 3);
	}},
	
	dirtblock = new StaticBlock("dirtblock"){{
		solid = true;
	}};
}
