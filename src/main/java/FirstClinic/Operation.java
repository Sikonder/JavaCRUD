package FirstClinic;

public enum Operation {
    ADD,CHANGEPET,GET,REMOVE,SHOWALL,EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        switch (i) {
            case 0:
                throw new IllegalArgumentException();

            case 1:
                return ADD;
            case 2:
                return GET;
            case 3:
                return REMOVE;
            case 4:
                return CHANGEPET;
            case 5:
                return SHOWALL;
            case 6:
                return EXIT;

            default:
                throw new IllegalArgumentException();
        }

    }

}
