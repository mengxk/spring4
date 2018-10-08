package com.example.object.knights;

public class DamselRecuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRecuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
