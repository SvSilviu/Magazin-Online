package Magazin;

import java.util.Objects;

public class Options {
    private int id;
    private String option_name;

    public Options(int id, String option_name) {
        this.id = id;
        this.option_name = option_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", option_name='" + option_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Options)) return false;
        Options options = (Options) o;
        return getId() == options.getId() && Objects.equals(getOption_name(), options.getOption_name());
    }

}
