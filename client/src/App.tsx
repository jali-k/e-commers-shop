import React from "react";
import { Routes, Route, BrowserRouter } from "react-router-dom";
import Header from "./components/Header";
import { Hero } from "./components/Hero";
import Products from "./components/Products";

const App = () => {
  return (
    <BrowserRouter>
      <Header />
      <Hero />
      <Products />
    </BrowserRouter>
  );
};

export default App;
