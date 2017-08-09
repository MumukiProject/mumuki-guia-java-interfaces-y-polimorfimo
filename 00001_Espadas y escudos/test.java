@Test
public void una_espada_tiene_10_de_ataque() {
  Assert.assertEquals(10, new Espada().puntosDeAtaque());
}

@Test
public void un_escudo_tiene_2_de_ataque() {
  Assert.assertEquals(2, new Escudo().puntosDeAtaque());
}

@Test
public void una_espada_tiene_1_de_defensa() {
  Assert.assertEquals(1, new Espada().puntosDeDefensa());
}

@Test
public void un_escudo_tiene_6_de_defensa() {
  Assert.assertEquals(6, new Escudo().puntosDeDefensa());
}