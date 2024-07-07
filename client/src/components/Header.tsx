import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import { MagnifyingGlassIcon } from "@heroicons/react/24/solid";

const Header = () => {
  return (
    <div className="bg-slate-200 text-amber-600 font-bold shadow-md">
      <div className="container mx-auto px-8 py-4 flex justify-between items-center max-w-6xl">
        <Link to={"/"}>
          <img src={logo} alt="Brand Logo" className="h-10 w-25"></img>
        </Link>
        <div className="relative flex-grow mx-8">
          <input
            type="text"
            placeholder="Search..."
            className="w-full py-2 pl-10 pr-4 rounded-lg border border-gray-300 focus:outline-none focus:ring-2 focus:ring-blue-500"
          />
          <div className="absolute inset-y-0 left-0 flex items-center pl-3 pointer-events-none">
            <MagnifyingGlassIcon className="h-5 w-5 text-gray-500" />
          </div>
        </div>
        <ul className="flex gap-7">
          <Link to={"/"}>
            <li>Cart</li>
          </Link>
          <Link to={"/about"}>
            <li>About</li>
          </Link>
          <Link to={"/sign-in"}>
            <li>Sign In</li>
          </Link>
        </ul>
      </div>
    </div>
  );
};

export default Header;
