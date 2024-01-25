package behavioral.iterator;

public class Dev implements Collection{
    private String Name;
    private String[] skills;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Dev(String name, String[] skills) {
        Name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }
    private class SkillIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            if(index< skills.length){
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {
            return skills[index++];
        }
    }
}
