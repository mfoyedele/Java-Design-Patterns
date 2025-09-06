package com.funso.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** HeroTest */
class HeroTest {

  /** Test if we get the expected exception when trying to create a hero without a profession */
  @Test
  void testMissingProfession() {
    assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(null, "Sir without a job"));
  }

  /** Test if we get the expected exception when trying to create a hero without a name */
  @Test
  void testMissingName() {
    assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(Profession.THIEF, null));
  }

  /** Test if the hero build by the builder has the correct attributes, as requested */
  @Test
  void testBuildHero() {
    final String heroName = "Sir Lancelot";

    final var hero =
        new Hero.Builder(Profession.WARRIOR, heroName)
            .withArmor(Armor.CHAIN_MAIL)
            .withWeapon(Weapon.SWORD)
            .withHairType(HairType.LONG_CURLY)
            .withHairColor(HairColor.BLOND)
            .build();

    assertNotNull(hero);
    assertNotNull(hero.toString());
    assertEquals(Profession.WARRIOR, hero.profession());
    assertEquals(heroName, hero.name());
    assertEquals(Armor.CHAIN_MAIL, hero.armor());
    assertEquals(Weapon.SWORD, hero.weapon());
    assertEquals(HairType.LONG_CURLY, hero.hairType());
    assertEquals(HairColor.BLOND, hero.hairColor());
  }
}