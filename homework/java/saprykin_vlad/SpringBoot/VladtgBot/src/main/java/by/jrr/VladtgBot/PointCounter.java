package by.jrr.VladtgBot;

import by.jrr.VladtgBot.config.CsvFileToGameLinks;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component("PointCounter")
public class PointCounter {
    int familyPoints;
    int warPoints;
    int partyPoints;
    int economyPoints;

    public PointCounter() {
    }

    public PointCounter(int familyPoints, int warPoints, int partyPoints, int economyPoints) {
        this.familyPoints = familyPoints;
        this.warPoints = warPoints;
        this.partyPoints = partyPoints;
        this.economyPoints = economyPoints;
    }

    public void setFamilyPoints(int familyPoints) {
        this.familyPoints = familyPoints;
    }

    public void setWarPoints(int warPoints) {
        this.warPoints = warPoints;
    }

    public void setPartyPoints(int partyPoints) {
        this.partyPoints = partyPoints;
    }

    public void setEconomyPoints(int economyPoints) {
        this.economyPoints = economyPoints;
    }

    public int getFamilyPoints() {
        return familyPoints;
    }

    public int getWarPoints() {
        return warPoints;
    }

    public int getPartyPoints() {
        return partyPoints;
    }

    public int getEconomyPoints() {
        return economyPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointCounter that = (PointCounter) o;
        return familyPoints == that.familyPoints && warPoints == that.warPoints && partyPoints == that.partyPoints && economyPoints == that.economyPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyPoints, warPoints, partyPoints, economyPoints);
    }

    @Override
    public String toString() {
        return "Результаты\n" +
                "familyPoints = " + familyPoints +
                "\nwarPoints = " + warPoints +
                "\npartyPoints = " + partyPoints +
                "\neconomyPoints = " + economyPoints;
    }

    public String chooseGame() {
        StringBuilder message = new StringBuilder();
        message.append("Вам подходит жанр ");
        if (familyPoints >= warPoints && familyPoints >= partyPoints && familyPoints >= economyPoints) {
            message.append(" семейных игр");
        } else if (warPoints >= partyPoints && warPoints >= economyPoints) {
            message.append(" вар геймов" + new CsvFileToGameLinks().getWarGames());
        } else if (partyPoints >= economyPoints) {
            message.append(" игр для вечеринки" + new CsvFileToGameLinks().getPartyGames());

        } else {
            message.append(" экономических игр");
        }
        message.append("\n");
        return String.valueOf(message);
    }
}
