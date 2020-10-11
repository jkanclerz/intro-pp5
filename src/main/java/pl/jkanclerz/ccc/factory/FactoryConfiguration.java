package pl.jkanclerz.ccc.factory;

public final class FactoryConfiguration {
    public static Boss getResponsibleEmployee() {
        return new Boss("Tonny", new Worker());
    }
}
