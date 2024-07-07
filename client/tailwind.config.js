/** @type {import('tailwindcss').Config} */
export default {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      colors: {
        customBlue: "#bde3e4",
        customYellow: "#f6c74e",
        darkBlue: "#003d4c",
      },
    },
  },
  plugins: [],
};
