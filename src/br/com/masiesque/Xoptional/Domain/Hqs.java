package br.com.masiesque.Xoptional.Domain;

public class Hqs {
    private String title;
    private Integer id;//usamos wrappers para usar o equals
    private Integer chapters;//usamos wrappers para usar o equals

    public Hqs(String title, int id, int chapters) {
        this.title = title;
        this.id = id;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "{Title: "+this.title+"\nID: "+this.id+"\nChapters: "+this.chapters+"\n}";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
