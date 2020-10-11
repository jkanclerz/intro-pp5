package pl.jkanclerz.ccc.factory;

public final class FactoryConfiguration {
    public static Employee getResponsibleEmployee() {
        return new Boss("Tonny", new Worker());
    }
}
