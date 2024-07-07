import React from "react";

export const Hero = () => {
  return (
    <section className="relative bg-white text-white overflow-hidden">
      <div className="absolute inset-0 p-11">
        <img
          src="https://www.free-mockup.com/wp-content/uploads/edd/2024/06/free-laptop-and-phone-mockup-01-1536x1152.jpg" // Replace with your hero image URL
          alt="Hero Background"
          className="w-full h-full object-cover  rounded-3xl object-center"
        />
      </div>
      <div className="relative z-10 container mx-auto px-6 py-32 md:px-12 md:py-48 text-center">
        <h1 className="text-4xl md:text-5xl font-bold mb-4">
          Welcome to{" "}
          <span className="text-yellow-300">Our Amazing Website</span>
        </h1>
        <p className="text-lg md:text-xl mb-8">
          Discover great content and explore the opportunities we offer.
        </p>
        <div className="flex justify-center space-x-4">
          <a
            href="#about"
            className="bg-white text-gray-600 mBlue hover:bg-gray-100 font-semibold py-3 px-6 rounded-lg shadow-md"
          >
            Learn More
          </a>
          <a
            href="#contact"
            className="bg-yellow-400 text-white hover:bg-yellow-500 font-semibold py-3 px-6 rounded-lg shadow-md"
          >
            Get Started
          </a>
        </div>
      </div>
    </section>
  );
};
