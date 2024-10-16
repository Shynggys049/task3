import java.util.List;

class DriverList {
    private List<Driver> drivers;

    public DriverList(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public DriverIterator iterator() {
        return new DriverIteratorImpl();
    }

    private class DriverIteratorImpl implements DriverIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < drivers.size();
        }

        @Override
        public Driver next() {
            if (this.hasNext()) {
                return drivers.get(index++);
            }
            return null;
        }
    }
}
