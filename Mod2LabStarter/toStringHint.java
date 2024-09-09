@Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (count == 0) {
            return "Contents of this list: []";
        } else {
            output.append("The contents of this list are: [");
            /*
            bunch of code to keep adding to this output
             */
            output.append("]");
            return output.toString();
        }
    }
